package polbeng.ac.id.mvvmramdani.view_model

import android.app.Application
import androidx.databinding.ObservableField
import androidx.lifecycle.AndroidViewModel
import polbeng.ac.id.mvvmramdani.model.mahasiswa
import java.util.*

class MainViewModel (application: Application): AndroidViewModel(application){
    var nim : ObservableField<String> = ObservableField()
    var nama : ObservableField<String> = ObservableField()
    var jurusan : ObservableField<String> = ObservableField()

    fun setData(mahasiswa: mahasiswa){
        nim.set(mahasiswa.nim)
        nama.set(mahasiswa.nama)
        jurusan.set(mahasiswa.jurusan)
    }
}