package com.mvvmproject.fordmapbox

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetBehavior



class BottomSheetFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*BottomSheetBehavior.from(bottomSheet).apply {
            peekHeight = 200
            this.state = BottomSheetBehavior.STATE_COLLAPSED
        }*/

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_bottom_sheet, container, false)
    }
}