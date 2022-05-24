package polbeng.ac.id.mvvmramdani.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import polbeng.ac.id.mvvmramdani.R
import polbeng.ac.id.mvvmramdani.view_model.MainViewModel
import polbeng.ac.id.mvvmramdani.databinding.ActivityMainBinding
import polbeng.ac.id.mvvmramdani.model.mahasiswa

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.main = viewModel

        val mhs = mahasiswa("6304191166", "Ramdani", "RPL")
        viewModel.setData(mhs)

    }
}

