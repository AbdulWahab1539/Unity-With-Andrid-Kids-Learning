package com.example.login.recyclerview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.login.GuardianDashboard
import com.example.login.R
import com.example.login.utils.LoadingScreen
import com.example.login.utils.Utils
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class CustomAdapter(private val mList: MutableList<ItemsViewModel>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    //    private var listData: MutableList<ItemsViewModel> = data as MutableList<ItemsViewModel>
    var loading: LoadingScreen = LoadingScreen

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_parcels, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val itemsViewModel = mList[position]
        holder.name.text = itemsViewModel.username
        holder.screenName.text = itemsViewModel.screenName
        holder.timeSpend.text = itemsViewModel.timeSpend
        holder.btnRemove.setOnClickListener {
            if (mList.size > 0)
                removeProgress(
                    holder,
                    itemsViewModel.userId,
                    itemsViewModel.stampId,
                    position
                )
        }
    }

    private fun removeProgress(holder: ViewHolder, userId: String, stampId: String, position: Int) {
        loading.displayLoadingWithText(holder.btnRemove.context, "Removing! Please wait", false)
        Firebase.database
            .getReferenceFromUrl("https://guardian-app-1a5f6-default-rtdb.firebaseio.com")
            .child("Progress")
            .child(FirebaseAuth.getInstance().currentUser!!.uid)
            .child(userId)
            .child(stampId)
            .removeValue().addOnSuccessListener {
                Log.i("mytag", "onBindViewHolder: " + mList.size)
                mList.removeAt(position)
                notifyItemRemoved(position)
                loading.hideLoading()
                Log.i("mytag", "onBindViewHolder: " + mList.size)
            }
    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val name: TextView = itemView.findViewById(R.id.tvv_name)
        val screenName: TextView = itemView.findViewById(R.id.tvv_screen)
        val timeSpend: TextView = itemView.findViewById(R.id.tvv_time_spend)
        val btnRemove: Button = itemView.findViewById(R.id.btn_remove)
    }
}
