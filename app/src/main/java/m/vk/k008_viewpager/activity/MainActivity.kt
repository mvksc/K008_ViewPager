package m.vk.k008_viewpager.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import m.vk.k008_viewpager.R
import m.vk.k008_viewpager.adapter.ViewPagerAdapterMain

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vpMain.adapter = ViewPagerAdapterMain(supportFragmentManager)

    }
}
