package lat.pam.utsppam;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class FoodData {
    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Nasi Goreng", "Bukan Sekedar nasi goreng biasa, ini dimasak oleh koki berpengalaman dengan bumbu rahasia khas Cafe Cozy yang akan membuat Anda menjalani hari dengan semangat...", "Rp.15.000", context.getDrawable(R.drawable.nasigoreng)));
        list.add(new Food("Mie Goreng", "Mie goreng yang dibuat dengan penuh keikhlasan yang akan membuat Anda merasakan kenyaman di mulut maupun di perut", "Rp.15.000", context.getDrawable(R.drawable.mie_goreng)));
        list.add(new Food("Cappuchino", "Kenikmatan yang tercipta dari perpaduan shot espresso, susu panas dan busa susu yang akan menemani hari indah anda", "Rp.20.000", context.getDrawable(R.drawable.cappuchino)));
        list.add(new Food("Sparkling Tea", "Minuman teh ringan dengan perasan jeruk lemon yang dapat menyegarkan mood Anda", "Rp.10.000", context.getDrawable(R.drawable.sparkling_tea)));
        list.add(new Food("Kopi Hitam", "Kopi hitam yang telah diracik oleh Barista terlatih yang menjadi minuman wajib bagi para pencari kenikmatan", "Rp.5.000", context.getDrawable(R.drawable.kopi_hitam)));
        return list;
    }
}

