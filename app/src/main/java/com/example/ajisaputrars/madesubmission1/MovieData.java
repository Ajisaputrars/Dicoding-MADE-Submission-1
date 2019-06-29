package com.example.ajisaputrars.madesubmission1;

import java.util.ArrayList;

public class MovieData {
    public static ArrayList<String> getTitles() {
        String[] titles = {
                "A Star is Born",
                "Aquaman",
                "Avengers: Infinity War",
                "Bird Box",
                "Bohemian Rhapsody",
                "Bumblebee",
                "Creed II",
                "Deadpool 2",
                "How to Train Your Dragon: The Hidden World",
                "Dragon Ball Super: Broly"
        };

        ArrayList<String> list = new ArrayList<>();
        for (String aData : titles) {
            list.add(aData);
        }
        return list;
    }

    public static ArrayList<String> getOverviews() {
        String[] overviews = {
                "Seorang bintang musik country yang karirnya mulai memudar, Jackson Maine (Bradley Cooper) menemukan sebuah talenta yang sangat berbakat di dalam diri dari seorang musisi muda bernama Ally (Lady Gaga). Maine berhasil mengorbitkan Ally menjadi seorang bintang muda yang menjanjikan. Namun keduanya terlibat hubungan yang lebih jauh dari sekedar mentor dan anak didik. Seiring dengan meroketnya karir dari Ally dan dirinya, Maine mengalami dilema mengenai masalah ini.",
                "Film ini mengungkap asal-usul Arthur Curry, manusia perkasa yang bisa mengendalikan air dan hewan laut. Dari mana ia mendapatkan kekuatannya? Siapa orang tuanya, dan pantaskah dia menjadi seorang raja di 7samudera?",
                "Melanjutkan Avengers Infinity War, dimana kejadian setelah Thanos berhasil mendapatkan semua infinity stones dan memusnahkan 50% semua mahluk hidup di alam semesta. Akankah para Avengers berhasil mengalahkan Thanos?",
                "Bird Box adalah sebuah film produksi tahun 2018 yang berasal dari Amerika Serikat bergenre post-apocalyptic. Film ini disutradarai oleh Susanne Bier, naskah ditulis oleh Eric Heisserer, berdasarkan novel berjudul sama, karya novelis Josh Malerman yang terbit pada tahun 2014. ",
                "Diangkat dari kisah nyata untuk merayakan musik band Rock legendaris QUEEN dan tentunya vokalis mereka yang luar biasa, FREDDIE MERCURY, yang dikenal menentang tradisi dan stereotip hingga menjadi salah satu penghibur yang paling dicintai di planet ini.",
                "Dalam pelarian di tahun 1987, Bumblebee menemukan perlindungan di tempat rongsokan di sebuah kota kecil pinggir pantai California. Charlie, gadis yang tengah menyentuh usia 18 tahun dan sedang mencari jati diri, menemukan Bumblebee, yang banyak tergores dan rusak. Ketika berusaha memfungsikannya",
                "Creed II akan melanjutkan kisah Adonis Johnson di dalam serta di luar ring saat ia berhadapan dengan ketenaran, masalah keluarga dan misi yang terus berlanjut untuk menjadi juara sejati.",
                "Wade Wilson (Ryan Reynolds) berusaha melindungi seorang mutan misterius yang diincar Cable (Josh Brolin). Untuk melindunginya, Wade lalu membentuk sebuah tim bernama X-Force yang beranggotakan Deadpool sendiri, Domino, Negasonic Teenage Warhead, Colossus, dan Bedlam.\n",
                "Di film ketiganya ini akan berkisah tentang Hiccup (Jay Baruchel) yang berusaha memenuhi impiannya untuk menciptakan sebuah negeri impian bagi para Viking dan naga",
                "Ini adalah kisah baru dari Bangsa Saiyan. Bumi damai setelah Turnamen Kekuasaan. Menyadari bahwa alam semesta masih memiliki banyak orang yang lebih kuat untuk ditemukan, Goku menghabiskan seluruh harinya berlatih untuk mencapai kemampuan bertarungnya yang lebih baik lagi."
        };

        ArrayList<String> list = new ArrayList<>();
        for (String aData : overviews) {
            list.add(aData);
        }
        return list;
    }

    public static ArrayList<String> getDates() {
        String[] dates = {"19/10/2018",
                "15/10/2017",
                "20/03/2016",
                "22/12/2018",
                "14/02/2019",
                "18/05/2019",
                "30/07/2018",
                "29/11/2017",
                "21/03/2018",
                "09/11/2019"
        };
        ArrayList<String> list = new ArrayList<>();
        for (String aData : dates) {
            list.add(aData);
        }
        return list;
    }

    public static ArrayList<Double> getVoteAverages() {
        double[] averages = {9.4,
                9.0,
                8.5,
                7.5,
                9.1,
                8.2,
                8.5,
                8.7,
                7.8,
                6.9
        };
        ArrayList<Double> list = new ArrayList<>();
        for (Double aData : averages) {
            list.add(aData);
        }
        return list;
    }
}
