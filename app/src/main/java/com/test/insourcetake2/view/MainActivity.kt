package com.test.insourcetake2.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.insourcetake2.R
import com.test.insourcetake2.contracts.MainPresenterInterface

class MainActivity : AppCompatActivity() , MainPresenterInterface.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun showProgressbar() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideProgressBar() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showSucessfullToast(message: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showUnsucessfulToast(message: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }



}
