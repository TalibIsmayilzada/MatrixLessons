package com.talib.matrix

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import coil.load


class ItemPagerAdapter(val list: List<SalesModel>): PagerAdapter() {

    override fun getCount(): Int = list.size

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val layoutInflater = container.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val slideLayout: View = layoutInflater.inflate(R.layout.sales_item_layout,container,false)

        val slideImg: ImageView = slideLayout.findViewById(R.id.myImage)
        val title: TextView = slideLayout.findViewById(R.id.title)
        val hour: TextView = slideLayout.findViewById(R.id.hour)


        slideImg.load(list[position].image){
            crossfade(true)
        }

        title.text = list[position].title
        hour.text = list[position].hour

        container.addView(slideLayout)
        return slideLayout
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`;
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}