import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager_test.ARG_OBJECT
import com.example.viewpager_test.NewFragment


class ViewPagerAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 5

    override fun createFragment(position: Int): Fragment {
        val fragment = NewFragment()
        fragment.arguments = Bundle().apply {
            putInt(ARG_OBJECT, position+1)
        }

        return fragment
    }
}

class PagerVH(itemView: View) : RecyclerView.ViewHolder(itemView)