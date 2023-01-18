package com.example.login

//import com.example.juvenilezone.R
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.login.models.Progress
import com.example.login.utils.Utils
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

//import com.example.juvenilezone.Sounds

//import com.jaeger.library.StatusBarUtil;
class ABCsounds : AppCompatActivity(), View.OnClickListener {
    var ba: Button? = null
    var bb: Button? = null
    var bc: Button? = null
    var bd: Button? = null
    var be: Button? = null
    var bf: Button? = null
    var bg: Button? = null
    var bh: Button? = null
    var bi: Button? = null
    var bj: Button? = null
    var bk: Button? = null
    var bl: Button? = null
    var bm: Button? = null
    var bn: Button? = null
    var bo: Button? = null
    var bp: Button? = null
    var bq: Button? = null
    var br: Button? = null
    var bs: Button? = null
    var bt: Button? = null
    var bu: Button? = null
    var bv: Button? = null
    var bw: Button? = null
    var bx: Button? = null
    var by: Button? = null
    var bz: Button? = null
    var startTime: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //StatusBarUtil.setTransparent(this);
        Utils.releaseMusic()
        window.setBackgroundDrawableResource(R.drawable.letters_bg)
        startTime = System.currentTimeMillis()
        setContentView(R.layout.activity_a_b_csounds)
        val ba = findViewById<ImageButton>(R.id.a)
        val bb = findViewById<ImageButton>(R.id.b)
        val bc = findViewById<ImageButton>(R.id.c)
        val bd = findViewById<ImageButton>(R.id.d)
        val be = findViewById<ImageButton>(R.id.e)
        val bf = findViewById<ImageButton>(R.id.f)
        val bg = findViewById<ImageButton>(R.id.g)
        val bh = findViewById<ImageButton>(R.id.h)
        val bi = findViewById<ImageButton>(R.id.i)
        val bj = findViewById<ImageButton>(R.id.j)
        val bk = findViewById<ImageButton>(R.id.k)
        val bl = findViewById<ImageButton>(R.id.l)
        val bm = findViewById<ImageButton>(R.id.m)
        val bn = findViewById<ImageButton>(R.id.n)
        val bo = findViewById<ImageButton>(R.id.o)
        val bp = findViewById<ImageButton>(R.id.p)
        val bq = findViewById<ImageButton>(R.id.q)
        val br = findViewById<ImageButton>(R.id.r)
        val bs = findViewById<ImageButton>(R.id.s)
        val bt = findViewById<ImageButton>(R.id.t)
        val bu = findViewById<ImageButton>(R.id.u)
        val bv = findViewById<ImageButton>(R.id.v)
        val bw = findViewById<ImageButton>(R.id.w)
        val bx = findViewById<ImageButton>(R.id.x)
        val by = findViewById<ImageButton>(R.id.y)
        val bz = findViewById<ImageButton>(R.id.z)
        ba.setOnClickListener(this)
        bb.setOnClickListener(this)
        bc.setOnClickListener(this)
        bd.setOnClickListener(this)
        be.setOnClickListener(this)
        bf.setOnClickListener(this)
        bg.setOnClickListener(this)
        bh.setOnClickListener(this)
        bi.setOnClickListener(this)
        bj.setOnClickListener(this)
        bk.setOnClickListener(this)
        bl.setOnClickListener(this)
        bm.setOnClickListener(this)
        bn.setOnClickListener(this)
        bo.setOnClickListener(this)
        bp.setOnClickListener(this)
        bq.setOnClickListener(this)
        br.setOnClickListener(this)
        bs.setOnClickListener(this)
        bt.setOnClickListener(this)
        bu.setOnClickListener(this)
        bv.setOnClickListener(this)
        bw.setOnClickListener(this)
        bx.setOnClickListener(this)
        by.setOnClickListener(this)
        bz.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.a -> {
                val mpa = MediaPlayer.create(this, R.raw.a)
                mpa.start()
                while (mpa.isPlaying) {
                }
                mpa.release()
            }
            R.id.b -> {
                val mpb = MediaPlayer.create(this, R.raw.b)
                mpb.start()
                while (mpb.isPlaying) {
                }
                mpb.release()
            }
            R.id.c -> {
                val mpc = MediaPlayer.create(this, R.raw.c)
                mpc.start()
                while (mpc.isPlaying) {
                }
                mpc.release()
            }
            R.id.d -> {
                val mpd = MediaPlayer.create(this, R.raw.d)
                mpd.start()
                while (mpd.isPlaying) {
                }
                mpd.release()
            }
            R.id.e -> {
                val mpe = MediaPlayer.create(this, R.raw.e)
                mpe.start()
                while (mpe.isPlaying) {
                }
                mpe.release()
            }
            R.id.f -> {
                val mpf = MediaPlayer.create(this, R.raw.f)
                mpf.start()
                while (mpf.isPlaying) {
                }
                mpf.release()
            }
            R.id.g -> {
                val mpg = MediaPlayer.create(this, R.raw.g)
                mpg.start()
                while (mpg.isPlaying) {
                }
                mpg.release()
            }
            R.id.h -> {
                val mph = MediaPlayer.create(this, R.raw.h)
                mph.start()
                while (mph.isPlaying) {
                }
                mph.release()
            }
            R.id.i -> {
                val mpi = MediaPlayer.create(this, R.raw.i)
                mpi.start()
                while (mpi.isPlaying) {
                }
                mpi.release()
            }
            R.id.j -> {
                val mpj = MediaPlayer.create(this, R.raw.j)
                mpj.start()
                while (mpj.isPlaying) {
                }
                mpj.release()
            }
            R.id.k -> {
                val mpk = MediaPlayer.create(this, R.raw.k)
                mpk.start()
                while (mpk.isPlaying) {
                }
                mpk.release()
            }
            R.id.l -> {
                val mpl = MediaPlayer.create(this, R.raw.l)
                mpl.start()
                while (mpl.isPlaying) {
                }
                mpl.release()
            }
            R.id.m -> {
                val mpm = MediaPlayer.create(this, R.raw.m)
                mpm.start()
                while (mpm.isPlaying) {
                }
                mpm.release()
            }
            R.id.n -> {
                val mpn = MediaPlayer.create(this, R.raw.n)
                mpn.start()
                while (mpn.isPlaying) {
                }
                mpn.release()
            }
            R.id.o -> {
                val mpo = MediaPlayer.create(this, R.raw.o)
                mpo.start()
                while (mpo.isPlaying) {
                }
                mpo.release()
            }
            R.id.p -> {
                val mpp = MediaPlayer.create(this, R.raw.p)
                mpp.start()
                while (mpp.isPlaying) {
                }
                mpp.release()
            }
            R.id.q -> {
                val mpq = MediaPlayer.create(this, R.raw.q)
                mpq.start()
                while (mpq.isPlaying) {
                }
                mpq.release()
            }
            R.id.r -> {
                val mpr = MediaPlayer.create(this, R.raw.r)
                mpr.start()
                while (mpr.isPlaying) {
                }
                mpr.release()
            }
            R.id.s -> {
                val mps = MediaPlayer.create(this, R.raw.s)
                mps.start()
                while (mps.isPlaying) {
                }
                mps.release()
            }
            R.id.t -> {
                val mpt = MediaPlayer.create(this, R.raw.t)
                mpt.start()
                while (mpt.isPlaying) {
                }
                mpt.release()
            }
            R.id.u -> {
                val mpu = MediaPlayer.create(this, R.raw.u)
                mpu.start()
                while (mpu.isPlaying) {
                }
                mpu.release()
            }
            R.id.v -> {
                val mpv = MediaPlayer.create(this, R.raw.v)
                mpv.start()
                while (mpv.isPlaying) {
                }
                mpv.release()
            }
            R.id.w -> {
                val mpw = MediaPlayer.create(this, R.raw.w)
                mpw.start()
                while (mpw.isPlaying) {
                }
                mpw.release()
            }
            R.id.x -> {
                val mpx = MediaPlayer.create(this, R.raw.x)
                mpx.start()
                while (mpx.isPlaying) {
                }
                mpx.release()
            }
            R.id.y -> {
                val mpy = MediaPlayer.create(this, R.raw.y)
                mpy.start()
                while (mpy.isPlaying) {
                }
                mpy.release()
            }
            R.id.z -> {
                val mpz = MediaPlayer.create(this, R.raw.z)
                mpz.start()
                while (mpz.isPlaying) {
                }
                mpz.release()
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val i = Intent(this@ABCsounds, KidsDashboard::class.java)
        startActivity(i)
    }

    override fun onStop() {
        super.onStop()
        Utils.postActivityData(this, startTime)
    }


    override fun onDestroy() {
        Utils.loadSound(this, R.raw.backgroundsound, false)
        super.onDestroy()
    }
}