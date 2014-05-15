/**
 * 
 */

package com.allen.funmirror;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/**
* 
* @ClassName: WelcomeActivity
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Allen
* @date 2014-5-15 下午5:09:51
*
*/
public class WelcomeActivity extends Activity {
	
	/**
	 * 
	 */
	private boolean isPlayGuide = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	                WindowManager.LayoutParams.FLAG_FULLSCREEN);

	   // getWindow().getDecorView().setAlpha(0.0f);
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		
		if(isPlayGuide){
			
			playGuide();
			
		}else{
			Intent intent = new Intent();
			intent.setClass(this, MirrorActivity.class);
			this.startActivity(intent);
		}
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		
		super.onDestroy();
	}

		
	private void playGuide(){
		
	}
}
