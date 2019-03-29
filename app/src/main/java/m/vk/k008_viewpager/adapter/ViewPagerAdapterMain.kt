package m.vk.k008_viewpager.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import m.vk.k008_viewpager.fragment.OneFragment
import m.vk.k008_viewpager.fragment.ThreeFragment
import m.vk.k008_viewpager.fragment.TwoFragment

class ViewPagerAdapterMain internal constructor(fm : FragmentManager) : FragmentStatePagerAdapter(fm){
    override fun getItem(position: Int): Fragment? {
        var fragment : Fragment? = null
       when(position){
           0 -> fragment = OneFragment.newInstance()
           1 -> fragment = TwoFragment.newInstance()
           2 -> fragment = ThreeFragment.newInstance()
       }
        return fragment
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return "หัวข้อ " + (position + 1)
    }

}