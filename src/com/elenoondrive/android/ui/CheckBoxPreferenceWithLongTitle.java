/* ownCloud Android client application
 *   Copyright (C) 2014 ownCloud Inc.
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License version 2,
 *   as published by the Free Software Foundation.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.elenoondrive.android.ui;

import android.content.Context;
import android.preference.CheckBoxPreference;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CheckBoxPreferenceWithLongTitle extends CheckBoxPreference{

    public CheckBoxPreferenceWithLongTitle(Context context) {
        super(context);
    }

    public CheckBoxPreferenceWithLongTitle(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public CheckBoxPreferenceWithLongTitle(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onBindView(View view) {
        super.onBindView(view);
        
        TextView titleView = (TextView) view.findViewById(android.R.id.title);
        TextView summary = (TextView) view.findViewById(android.R.id.summary);
        
        RelativeLayout.LayoutParams params = (android.widget.RelativeLayout.LayoutParams) titleView.getLayoutParams();
        params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
//        params.addRule(RelativeLayout.LEFT_OF, android.R.id.checkbox);  
        
        titleView.setLayoutParams(params);
        
        RelativeLayout.LayoutParams params2 = (android.widget.RelativeLayout.LayoutParams) summary.getLayoutParams();
        params2.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        params2.addRule(Gravity.RIGHT);


        
        titleView.setSingleLine(true);
//        titleView.setMaxLines(3);
        titleView.setEllipsize(null);
        
        summary.setLayoutParams(params2);
        summary.setSingleLine(true);
       
    }
}