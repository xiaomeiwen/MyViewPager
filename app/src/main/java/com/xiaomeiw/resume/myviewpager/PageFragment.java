package com.xiaomeiw.resume.myviewpager;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v4.app.Fragment;

/**
 * Created by wenxiaomei on 17/5/20.
 */

public class PageFragment extends Fragment {

    public static final String KEY_PAGE = "page";

    private TextView textView;

    @NonNull
    public static PageFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(KEY_PAGE, page);

        PageFragment pageFragment = new PageFragment();
        pageFragment.setArguments(args);
        return pageFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.page_fragment, container, false);
        textView = (TextView) view.findViewById(R.id.text_view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        int page = getArguments().getInt(KEY_PAGE);
        textView.setText("Page " + page);
    }
    //    onViewCreated(View view, Bundle savedInstanceState)
//
//    Called immediately after onCreateView(LayoutInflater, ViewGroup, Bundle) has returned,
//    but before any saved state has been restored in to the view.
//    This gives subclasses a chance to initialize themselves once they know their view hierarchy has been completely created.
//    The fragment's view hierarchy is not however attached to its parent at this point.

}
