package com.devjurnal.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    ArrayList<ResepModel> listResep;
    ResepAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 1. koneksi dengan recycler pada XML
        recycler = (RecyclerView) findViewById(R.id.recyclerView);

        // TODO 2. Buat Model Class
        // TODO 3. BUat Array List
        listResep = new ArrayList<>();

        // TODO 4. Set data ke ResepModel
        ResepModel resep3 = new ResepModel();
        ResepModel resep4 = new ResepModel();
        ResepModel resep5 = new ResepModel();

        // TODO 5. Masukkan data ke List
            ResepModel resep1 = new ResepModel();
            resep1.setJudul("Sayur Bayam");
            resep1.setPoster("http://resepmedia.com/wp-content/uploads/2017/05/Gambar-Sayur-Bayam.jpg");
            resep1.setSummary("Membuat masakan sayur bayam sederhana yg nikmat.");
            resep1.setDetail(
                    "Bahan-Bahan :" +
                    "\nBayam segar kurang lebih 2 ikat saja. Cuci bersih lalu petik dan buang bagian pangkalnya."+
                    "\nBuah tomat ukuran sedang besar kurang lebih sebanyak 1 pcs."+
                    "\nBawang putih kurang lebih sebanyak 1 pcs saja. Kupas kulitnya lalu iris iris tipis."+
                    "\nJagung manis segar yang sudah dipotong potong sesuai selera kurang lebih sebanyak 1 pcs saja."+
                    "\nGula pasir putih secukupnya sesuai selera."+
                    "\n4 sdt garam"+
                    "\n4 sdt gula merah sisir"+
                    "\n1 batang daun bawang, diiris halus"+
                    "\nKaldu instan rasa ayam secukupnya sesuai selera.\n"+
                    "Garam dapur beryodium secukupnya sesuai selera.\n"+
                    "Air bersih secukupnya\n"+


                    "\n\nLangkah :" +

                    "\nSiapkan panci dan beri air secukupnya. Masak sampai mendidih.\n"+
                    "Masukkan potongan jagung manisnya bersama dengan potongan jagung manisnya.\n"+
                    "Aduk aduk sebentar dan masak sampai jagungnya hampir matang.\n"+
                    "Masukkan sayuran bayam bersama irisan buah tomatnya dan kaldu instan ayam secukupnya. Aduk aduk sampai semua bahan tercampur rata.\n"+
                    "Masukkan gula pasir dan garam dapur beryodium secukupnya sesuai selera dan aduk aduk kembali sampai semua bahan tercampur rata.\n"+
                    "Setelah semua bahan matang, tes rasanya dan tambahkan kaldu, gula dan garam kalau diperlukan.\n"+
                    "Angkat dan sajikan resep masakan sehari-hari yang sederhana ini saat masih hangat.\n");
            listResep.add(resep1);

            ResepModel resep2 = new ResepModel();
            resep2.setJudul("Tumis Jamur Tiram");
            resep2.setPoster("https://selerasa.com/images/sayuran/Resep-tumis-jamur-tiram-sederhana.jpg");
            resep2.setSummary("Membuat tumis jamur Tiram sederhana yang nikmat.");
            resep2.setDetail(
                    "Bahan Bahan :"+
                    "\n250 gr Jamur Tiram"+
                    "\nSedikit Belimbing Wuluh/ Tomat (saya: Daun Sinom)"+
                    "\nDaun Pisang utk membungkus"+

                    "\n\nBahan Halus :"+
                    "\n7 siung Bawang Merah"+
                    "\n4 siung Bawang Putih"+
                    "\n6 biji Cabai Rawit (sesuai selera)"+
                    "\nSecukupnya Ketumbar"+
                    "\nSecukupnya Gula Garam"+

                    "\n\nLangkah :"+
                    "\nSuwir2 jamur, cuci tiriskan."+
                    "\nUleg bumbu. Tambahkan sedikit air matang. Urap jamur dgn bumbu. Bungkus dgn daun pisang. Kukus smp matang");
            listResep.add(resep2);

            resep3.setJudul("Tahu Gimbal");
            resep3.setPoster("http://indonesiana.co.id/wp-content/uploads/2016/06/Tahu-Gimbal.jpg");
            resep3.setSummary("Tahu Gimbal adalah makanan khas yang berasal dari kota Semarang JawaTengah.");
            resep3.setDetail(
                    "Bahan Bahan :"+
                    "\n1 buah tahu cina, potong 2×2 cm" +
                    "\n100 ml air" +
                    "\n1/2 sendok teh garam" +
                    "\n100 gram kol, diiris tipis, seduh sampai layu" +
                    "\n2 tangkai seledri, diiris halus untuk taburan:" +
                    "\n2 sendok makan bawang merah goreng untuk taburan" +
                    "\nkerupuk udang kecil untuk pelengkap" +
                    "\nminyak untuk menggoreng" +

                    "\nBahan Gimbal Udang :" +

                    "\n300 gram udang, dikupas" +
                    "\n150 gram tepung terigu protein sedang" +
                    "\n25 gram tepung beras" +
                    "\n1 sendok teh garam" +
                    "\n1/4 sendok teh merica bubuk" +
                    "\n2 butir telur, dikocok lepas bubuk" +
                    "\n150 ml air" +

                    "\n\nBahan Saus (per Porsi) :" +

                    "\n2 buah cabai rawit merah" +
                    "\n1 sendok teh petis" +
                    "\n1 siung bawang putih" +
                    "\n1/2 sendok teh gula merah" +
                    "\n1/2 sendok teh garam" +
                    "\n30 gram kacang tanah kulit, digoreng, dihaluskan" +
                    "\n2 sendok teh kecap manis" +
                    "\n2 sendok teh air asam jawa" +
                    "\n75 ml air"+

                    "\n\nLangkah :"+
                    "\n1. Rendam tahu dalam air dan garam. Diamkan 5 menit. Goreng sampai matang. Sisihkan."+
                    "\n2. Gimbal udang, aduk tepung terigu, tepung beras, garam, merica bubuk, dan air. Tambahkan telur. Aduk rata. Masukkan udang. Aduk rata. Ambil 1 sendok sayur adonan. Goreng sampai matang. Sisihkan."+
                    "\n3. Saus, haluskan cabai rawit, petis, bawang putih, gula merah, dan garam. Masukkan kacang tanah, ulek rata. Tambahkan kecap manis, air asam, dan air sambil diulek rata."+
                    "\n4. Tata potongan tahu, kol, dan gimbal udang. Siramkan saus. Taburi seledri dan bawang goreng. Sajikan bersama kerupuk udang."
            );

            listResep.add(resep3);
            resep4.setJudul("Pepes Tahu");
            resep4.setPoster("http://resepkoki.co/wp-content/uploads/2015/01/pepestahu.jpg");
            resep4.setSummary("Membat pepes tahu sederhana yang nikmat");
            resep4.setDetail(
                    "Bahan :"+
                    "\n10 biji tahu kuning" +
                    "\n2 ikat daun kemangi" +
                    "\n2 btr telur" +
                    "\nMasako ayam scukupny" +

                            "\n\n Bumbu Iris  :"+
                            "\n1 bh tomat" +
                            "\n5 siung bwang merah" +
                            "\n3 batang daun bwang" +
                    "\n\nLangkah :"+
                    "\n1. Hancurkan tahu lalu tambahkan bwang mrah, daun bwang, tomat yg sdh d'iris, daun kemangi yg sdh dpetik2, telur, masako ayam aduk smp rata."+
                    "\n2. Tuangkan adonan tahu kira2 (3 sdm) ke daun pisang yg sdh dpanaskan di api kompor & dilap bersih lalu tusuk dgn tusukan gigi"+
                    "\n3. Panaskan kukusan smp panas lalu msukan tahu dan tunggu kurleb 1 jam smp tahu matang dan sajikan.");


        listResep.add(resep4);
        resep5.setJudul("Nasi Gudeg");
        resep5.setPoster("http://gudegyudjumpusat.com/wp-content/uploads/2015/12/Nasi-Gudeg-Ayam-Paha-Atas-Kecil.jpg");
        resep5.setSummary("Nasi Gudeg adalah makanan khas yang berasal dari kota kraton Yogyakarta.");
        resep5.setDetail(
                    "Bahan Bahan :"+
                    "\n1 kilogram Nangka muda di potong potong"+
                    "\n200 gram gula merah di sisir"+
                    "\nSantan kelapa kental"+
                    "\n10 butir telur di rebus"+
                    "\nDaun salam 2 atau 3 lembar"+
                    "\n1 liter air kelapa"+
                    "\nLengkuas potong memanjang"+

                    "\n\nBumbu Halus"+

                    "\nBawang merah 15 siung"+
                    "\nBawang putih 10 siung"+
                    "\nKemiri 10 buah disangrai"+
                    "\nKetumbar 2 sendok teh"+
                    "\nSatu setengah sendok teh merica"+
                    "\nGaram"+

                    "\n\nLangkah :"+
                    "\n1. Cuci buah nangka dengan bersih"+
                    "\n2. Sediakan Kuali (kendil) untuk memasak, masukan daun salam kemudian lengkuas dan masukan pula nangka, telur rebus serta gula aren"+
                    "\n3. Masukan air kelapa setengahnya saja kemudian masukan bumbu yang sudah dihaluskan aduk hingga tercampur rata"+
                    "\n4. Masukan setengah lagi air kelapa ke dalam panci hingga buah nangka terendam. Kemudian masak"+
                    "\n5. Masak bahan bahan dengan panci tertutup selama sekitar dua jam. Jika airnya sudah berkurang bahkan habis pisahkan telur rebusnya"+
                    "\n6. Santan dituangkan sambil nangkanya diaduk aduk."+
                    "\n7. Telur rebus dimasukkan kembali hingga terendam bersama dengan nangka"+
                    "\n8. Masak bahan bahan dengan api kecil kurang lebih empat jam. Biarkan hingga berubah kecoklatan dan kuahnya habis."
        );
        listResep.add(resep5);

        // TODO 6. Buat Adapter
        // TODO 7. Set Adapter
        adapter = new ResepAdapter(MainActivity.this, listResep);
        recycler.setAdapter(adapter);

        // TODO 8. Buat LayoutManager
        recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}
