package my.android.project

import _root_.android.app.Activity
import _root_.android.os.Bundle
import  android.util.Log

import com.umeng.analytics.MobclickAgent
class MainActivity extends Activity with TypedActivity {
  override def onCreate(bundle: Bundle) {
    super.onCreate(bundle)
    setContentView(R.layout.main)
    android.util.Log.v("filter1","<this is my log statement>");

    findView(TR.textview).setText("hello, world!scala中国1234")
  }
  /*
  onResume() {
    super.onResume();
    MobclickAgent.onResume(this);
}
*/

    override def onResume : Unit =
    {
    super.onResume();
    MobclickAgent.onResume(this);
    }
        override def onPause: Unit =
    {
    super.onPause();
    MobclickAgent.onPause(this);
    }

}
