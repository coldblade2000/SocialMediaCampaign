package com.twotowerstudios.socialmediacampaign;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.github.ksoichiro.android.observablescrollview.ObservableScrollView;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks;
import com.github.ksoichiro.android.observablescrollview.ScrollState;

public class IntroFragment extends Fragment implements ObservableScrollViewCallbacks {
    LinearLayout llMainHeader,llIntro, llLogo;
    ImageView ivLogo;
    private String title;
    private int page;
    //ScrollView scrollview;
    Animation slideUp,slideDown;

    public static IntroFragment newInstance(int page, String title) {
        IntroFragment fragment = new IntroFragment();
        /**Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragment.setArguments(args);*/
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //page = getArguments().getInt("someInt", 0);
        //title = getArguments().getString("someTitle");


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_intro, container, false);
        ObservableScrollView scrollView = (ObservableScrollView) view.findViewById(R.id.osvIntro);
        //scrollview = (ScrollView) view.findViewById(R.id.svIntro);
        llMainHeader = (LinearLayout) view.findViewById(R.id.llMainHeader);
        llIntro = (LinearLayout) view.findViewById(R.id.llIntro);
        scrollView.setScrollViewCallbacks(this);
        // Inflate the layout for this fragment
        slideUp = AnimationUtils.loadAnimation(getContext(), R.anim.slide_up);
        slideDown = AnimationUtils.loadAnimation(getContext(), R.anim.slide_down);
        return view;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onScrollChanged(int scrollY, boolean firstScroll, boolean dragging) {

    }

    @Override
    public void onDownMotionEvent() {

    }

    @Override
    public void onUpOrCancelMotionEvent(ScrollState scrollState) {
        //ActionBar ab =((AppCompatActivity) getActivity()).getSupportActionBar();
        //android.support.v7.app.ActionBar ab = (android.support.v7.app.ActionBar) getView().findViewById(R.id.toolbar);

        if (scrollState == ScrollState.DOWN) {
            /**if (ab.isShowing()) {
                ab.hide();
            }
            if(llMainHeader.isShown()){
                llMainHeader.setVisibility(View.GONE);
            }*/
            //llMainHeader.startAnimation(slideUp);
            /**llMainHeader.animate()
                    .translationY(0)

                    .alpha(100f)
                    .setListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animation) {
                            super.onAnimationEnd(animation);
                            llMainHeader.setVisibility(View.VISIBLE);
                        }
                    });*/
        //((AppCompatActivity) getActivity()).getSupportActionBar().show();
        llMainHeader.setVisibility(View.VISIBLE);
        } else if (scrollState == ScrollState.UP) {
            /**if (!ab.isShowing()) {
                ab.show();
            }
            if(!llMainHeader.isShown()){
                llMainHeader.setVisibility(View.VISIBLE);
            }*/
            //llMainHeader.startAnimation(slideDown);
            /**llMainHeader.animate()
                    .translationY(0)
                    .alpha(0.0f)
                    .setListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animation) {
                            super.onAnimationEnd(animation);
                            llMainHeader.setVisibility(View.GONE);
                        }
                    });*/

            //((AppCompatActivity) getActivity()).getSupportActionBar().hide();
            llMainHeader.setVisibility(View.GONE);
        }
    }
}
