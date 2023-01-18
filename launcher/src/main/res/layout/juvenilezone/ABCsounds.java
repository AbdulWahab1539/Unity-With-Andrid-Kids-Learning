package com.example.juvenilezone;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//import com.jaeger.library.StatusBarUtil;

public class ABCsounds extends AppCompatActivity implements View.OnClickListener {
    Button ba,bb,bc,bd,be,bf,bg,bh,bi,bj,bk,bl,bm,bn,bo,bp,bq,br,bs,bt,bu,bv,bw,bx,by,bz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //StatusBarUtil.setTransparent(this);
        getWindow().setBackgroundDrawableResource(R.drawable.letters_bg);
        setContentView(R.layout.activity_a_b_csounds);

        ba=findViewById(R.id.a);
        bb=findViewById(R.id.b);
        bc=findViewById(R.id.c);
        bd=findViewById(R.id.d);
        be=findViewById(R.id.e);
        bf=findViewById(R.id.f);
        bg=findViewById(R.id.g);
        bh=findViewById(R.id.h);
        bi=findViewById(R.id.i);
        bj=findViewById(R.id.j);
        bk=findViewById(R.id.k);
        bl=findViewById(R.id.l);
        bm=findViewById(R.id.m);
        bn=findViewById(R.id.n);
        bo=findViewById(R.id.o);
        bp=findViewById(R.id.p);
        bq=findViewById(R.id.q);
        br=findViewById(R.id.r);
        bs=findViewById(R.id.s);
        bt=findViewById(R.id.t);
        bu=findViewById(R.id.u);
        bv=findViewById(R.id.v);
        bw=findViewById(R.id.w);
        bx=findViewById(R.id.x);
        by=findViewById(R.id.y);
        bz=findViewById(R.id.z);

        ba.setOnClickListener(this);
        bb.setOnClickListener(this);
        bc.setOnClickListener(this);
        bd.setOnClickListener(this);
        be.setOnClickListener(this);
        bf.setOnClickListener(this);
        bg.setOnClickListener(this);
        bh.setOnClickListener(this);
        bi.setOnClickListener(this);
        bj.setOnClickListener(this);
        bk.setOnClickListener(this);
        bl.setOnClickListener(this);
        bm.setOnClickListener(this);
        bn.setOnClickListener(this);
        bo.setOnClickListener(this);
        bp.setOnClickListener(this);
        bq.setOnClickListener(this);
        br.setOnClickListener(this);
        bs.setOnClickListener(this);
        bt.setOnClickListener(this);
        bu.setOnClickListener(this);
        bv.setOnClickListener(this);
        bw.setOnClickListener(this);
        bx.setOnClickListener(this);
        by.setOnClickListener(this);
        bz.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
                  switch (v.getId()){
                      case R.id.a:
                         MediaPlayer mpa = MediaPlayer.create(this, R.raw.a);
                          mpa.start();
                          while (mpa.isPlaying()) {
                          };
                          mpa.release();
                          break;
                      case R.id.b:
                           MediaPlayer mpb = MediaPlayer.create(this, R.raw.b);
                          mpb.start();
                          while (mpb.isPlaying()) {
                          };
                          mpb.release();

                          break;
                      case R.id.c:
                           MediaPlayer mpc = MediaPlayer.create(this, R.raw.c);
                          mpc.start();
                          while (mpc.isPlaying()) {
                          };
                          mpc.release();

                          break;

                      case R.id.d:
                           MediaPlayer mpd = MediaPlayer.create(this, R.raw.d);
                          mpd.start();
                          while (mpd.isPlaying()) {
                          };
                          mpd.release();
                          break;
                      case R.id.e:
                          final MediaPlayer mpe = MediaPlayer.create(this, R.raw.e);
                          mpe.start();
                          while (mpe.isPlaying()) {
                          };
                          mpe.release();
                          break;
                      case R.id.f:
                          final MediaPlayer mpf = MediaPlayer.create(this, R.raw.f);
                          mpf.start();
                          while (mpf.isPlaying()) {
                          };
                          mpf.release();
                          break;
                      case R.id.g:
                          final MediaPlayer mpg = MediaPlayer.create(this, R.raw.g);
                          mpg.start();
                          while (mpg.isPlaying()) {
                          };
                          mpg.release();
                          break;
                      case R.id.h:
                          final MediaPlayer mph = MediaPlayer.create(this, R.raw.h);
                          mph.start();
                          while (mph.isPlaying()) {
                          };
                          mph.release();
                          break;
                      case R.id.i:
                          final MediaPlayer mpi = MediaPlayer.create(this, R.raw.i);
                          mpi.start();
                          while (mpi.isPlaying()) {
                          };
                          mpi.release();
                          break;
                      case R.id.j:
                          final MediaPlayer mpj = MediaPlayer.create(this, R.raw.j);
                          mpj.start();
                          while (mpj.isPlaying()) {
                          };
                          mpj.release();
                          break;
                      case R.id.k:
                          final MediaPlayer mpk = MediaPlayer.create(this, R.raw.k);
                          mpk.start();
                          while (mpk.isPlaying()) {
                          };
                          mpk.release();
                          break;
                      case R.id.l:
                          final MediaPlayer mpl = MediaPlayer.create(this, R.raw.l);
                          mpl.start();
                          while (mpl.isPlaying()) {
                          };
                          mpl.release();
                          break;
                      case R.id.m:
                          final MediaPlayer mpm = MediaPlayer.create(this, R.raw.m);
                          mpm.start();
                          while (mpm.isPlaying()) {
                          };
                          mpm.release();
                          break;
                      case R.id.n:
                          final MediaPlayer mpn = MediaPlayer.create(this, R.raw.n);
                          mpn.start();
                          while (mpn.isPlaying()) {
                          };
                          mpn.release();
                          break;
                      case R.id.o:
                          final MediaPlayer mpo = MediaPlayer.create(this, R.raw.o);
                          mpo.start();
                          while (mpo.isPlaying()) {
                          };
                          mpo.release();
                          break;
                      case R.id.p:
                          final MediaPlayer mpp = MediaPlayer.create(this, R.raw.p);
                          mpp.start();
                          while (mpp.isPlaying()) {
                          };
                          mpp.release();
                          break;
                      case R.id.q:
                          final MediaPlayer mpq = MediaPlayer.create(this, R.raw.q);
                          mpq.start();
                          while (mpq.isPlaying()) {
                          };
                          mpq.release();
                          break;
                      case R.id.r:
                          final MediaPlayer mpr = MediaPlayer.create(this, R.raw.r);
                          mpr.start();
                          while (mpr.isPlaying()) {
                          };
                          mpr.release();
                          break;
                      case R.id.s:
                          final MediaPlayer mps = MediaPlayer.create(this, R.raw.s);
                          mps.start();
                          while (mps.isPlaying()) {
                          };
                          mps.release();
                          break;
                      case R.id.t:
                          final MediaPlayer mpt = MediaPlayer.create(this, R.raw.t);
                          mpt.start();
                          while (mpt.isPlaying()) {
                          };
                          mpt.release();
                          break;
                      case R.id.u:
                          final MediaPlayer mpu = MediaPlayer.create(this, R.raw.u);
                          mpu.start();
                          while (mpu.isPlaying()) {
                          };
                          mpu.release();
                          break;
                      case R.id.v:
                          final MediaPlayer mpv = MediaPlayer.create(this, R.raw.v);
                          mpv.start();
                          while (mpv.isPlaying()) {
                          };
                          mpv.release();
                          break;
                      case R.id.w:
                          final MediaPlayer mpw = MediaPlayer.create(this, R.raw.w);
                          mpw.start();
                          while (mpw.isPlaying()) {
                          };
                          mpw.release();
                          break;
                      case R.id.x:
                          final MediaPlayer mpx = MediaPlayer.create(this, R.raw.x);
                          mpx.start();
                          while (mpx.isPlaying()) {
                          };
                          mpx.release();
                          break;
                      case R.id.y:
                          final MediaPlayer mpy = MediaPlayer.create(this, R.raw.y);
                          mpy.start();
                          while (mpy.isPlaying()) {
                          };
                          mpy.release();
                          break;
                      case R.id.z:
                          final MediaPlayer mpz = MediaPlayer.create(this, R.raw.z);
                          mpz.start();
                          while (mpz.isPlaying()) {
                          };
                          mpz.release();
                          break;

                  }
    }
    public void onBackPressed() {
        super.onBackPressed();

        Intent i=new Intent(ABCsounds.this, com.example.juvenilezone.Sounds.class);
        startActivity(i);
    }

}