class Book{
    private String judul;
    private String pengarang;
    private String penerbit;
    private int tahunTerbit;

    public void setJudul(String judul){
        this.judul = judul;
    }

    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }

    public void setPenerbit(String penerbit){
        this.penerbit = penerbit;
    }

    public void setTahunTerbit(int tahunTerbit){
        this.tahunTerbit = tahunTerbit;
    }

    public int getTahunTerbit(int tahunTerbit){
        return tahunTerbit;
    }

    public void isiKategori(){
        System.out.println("Judul           : " + judul);
        System.out.println("Pengarang       : " + pengarang);
        System.out.println("Penerbit        : " + penerbit);
        System.out.println("Tahun Terbit    : " + tahunTerbit);
        System.out.println("=======================================================");
    }

    public void teknologi(){
        Book teknologi1 = new Book();
        teknologi1.setJudul("Mahir Jaringan Komputer");
        teknologi1.setPengarang("Alan Nur");
        teknologi1.setPenerbit("Gramedia");
        teknologi1.setTahunTerbit(2013);
        teknologi1.isiKategori();

        Book teknologi2 = new Book();
        teknologi2.setJudul("Rangkaian Listrik");
        teknologi2.setPengarang("Cekmas Cekdin");
        teknologi2.setPenerbit("Gramedia");
        teknologi2.setTahunTerbit(2010);
        teknologi2.isiKategori();

        Book teknologi3 = new Book();
        teknologi3.setJudul("Administrasi Jaringan Linux");
        teknologi3.setPengarang("Wahana");
        teknologi3.setPenerbit("Gramedia");
        teknologi3.setTahunTerbit(2012);
        teknologi3.isiKategori();

        Book teknologi4 = new Book();
        teknologi4.setJudul("Pengantar Teknik Elektro");
        teknologi4.setPengarang("Budi Astuti");
        teknologi4.setPenerbit("Gramedia");
        teknologi4.setTahunTerbit(2011);
        teknologi4.isiKategori();

        Book teknologi5 = new Book();
        teknologi5.setJudul("Belajar Merakit Komputer");
        teknologi5.setPengarang("Atang Gumawang");
        teknologi5.setPenerbit("Gramedia");
        teknologi5.setTahunTerbit(2010);
        teknologi5.isiKategori();
    }

    public void sejarah(){
        Book sejarah1 = new Book();
        sejarah1.setJudul("Jejak Mataram Islam");
        sejarah1.setPengarang("Wiratna");
        sejarah1.setPenerbit("Gramedia");
        sejarah1.setTahunTerbit(2008);
        sejarah1.isiKategori();

        Book sejarah2 = new Book();
        sejarah2.setJudul("Hikayat Majapahit");
        sejarah2.setPengarang("Oktorino");
        sejarah2.setPenerbit("Gramedia");
        sejarah2.setTahunTerbit(2014);
        sejarah2.isiKategori();

        Book sejarah3 = new Book();
        sejarah3.setJudul("Walisongo");
        sejarah3.setPengarang("Noviyanti");
        sejarah3.setPenerbit("Gramedia");
        sejarah3.setTahunTerbit(2006);
        sejarah3.isiKategori();

        Book sejarah4 = new Book();
        sejarah4.setJudul("Oeang Republik Indonesia");
        sejarah4.setPengarang("Suwito Harsono");
        sejarah4.setPenerbit("Gramedia");
        sejarah4.setTahunTerbit(2016);
        sejarah4.isiKategori();

        Book sejarah5 = new Book();
        sejarah5.setJudul("Sufisme Jawa");
        sejarah5.setPengarang("Dr Simuh");
        sejarah5.setPenerbit("Gramedia");
        sejarah5.setTahunTerbit(2018);
        sejarah5.isiKategori();
    }

    public void psikologi(){
        Book psikologi1 = new Book();
        psikologi1.setJudul("PSikologi Belajar");
        psikologi1.setPengarang("Afi Parnawi");
        psikologi1.setPenerbit("Gramedia");
        psikologi1.setTahunTerbit(2019);
        psikologi1.isiKategori();


        Book psikologi2 = new Book();
        psikologi2.setJudul("Psikologi Komunikasi");
        psikologi2.setPengarang("Markus Utomo Sukendar");
        psikologi2.setPenerbit("Gramedia");
        psikologi2.setTahunTerbit(2017);
        psikologi2.isiKategori();

        Book psikologi3 = new Book();
        psikologi3.setJudul("Manusia Dalam Pandangan Psikologi");
        psikologi3.setPengarang("Pasiska");
        psikologi3.setPenerbit("Gramedia");
        psikologi3.setTahunTerbit(2020);
        psikologi3.isiKategori();

        Book psikologi4 = new Book();
        psikologi4.setJudul("Warna-Warni Psikologi Untuk Negeri");
        psikologi4.setPengarang("Azza");
        psikologi4.setPenerbit("Gramedia");
        psikologi4.setTahunTerbit(2019);
        psikologi4.isiKategori();

        Book psikologi5 = new Book();
        psikologi5.setJudul("Psikologi Industri dan Organisasi");
        psikologi5.setPengarang("Hany Umama");
        psikologi5.setPenerbit("Gramedia");
        psikologi5.setTahunTerbit(2019);
        psikologi5.isiKategori();
    }

    public void filsafat(){
        Book filsafat1 = new Book();
        filsafat1.setJudul("Studi Dasar Filsafat");
        filsafat1.setPengarang("Tazkiyah Basa’ad");
        filsafat1.setPenerbit("Gramedia");
        filsafat1.setTahunTerbit(2018);
        filsafat1.isiKategori();

        Book filsafat2 = new Book();
        filsafat2.setJudul("Filsafat Pendidikan Islam");
        filsafat2.setPengarang("Sehat Sultoni Dalimunthe");
        filsafat2.setPenerbit("Gramedia");
        filsafat2.setTahunTerbit(2018);
        filsafat2.isiKategori();

        Book filsafat3 = new Book();
        filsafat3.setJudul("Filsafat Pendidikan Operasional");
        filsafat3.setPengarang("Aswasulasikin");
        filsafat3.setPenerbit("Gramedia");
        filsafat3.setTahunTerbit(2018);
        filsafat3.isiKategori();

        Book filsafat4 = new Book();
        filsafat4.setJudul("Filsafat Pendidikan Vokasi");
        filsafat4.setPengarang("Soetyono Iskandar");
        filsafat4.setPenerbit("Gramedia");
        filsafat4.setTahunTerbit(2017);
        filsafat4.isiKategori();

        Book filsafat5 = new Book();
        filsafat5.setJudul("Fislafat Hukum");
        filsafat5.setPengarang("Urip Sucipto");
        filsafat5.setPenerbit("Gramedia");
        filsafat5.setTahunTerbit(2016);
        filsafat5.isiKategori();
    }

    public void fiksi(){
        Book fiksi1 = new Book();
        fiksi1.setJudul("Imperfect");
        fiksi1.setPengarang("Meira Anastasia");
        fiksi1.setPenerbit("Gramedia");
        fiksi1.setTahunTerbit(2018);
        fiksi1.isiKategori();

        Book fiksi2 = new Book();
        fiksi2.setJudul("Antologi Rasa");
        fiksi2.setPengarang("Ika Natasya");
        fiksi2.setPenerbit("Gramedia");
        fiksi2.setTahunTerbit(2011);
        fiksi2.isiKategori();

        Book fiksi3 = new Book();
        fiksi3.setJudul("Mariposa");
        fiksi3.setPengarang("Luluk Hf");
        fiksi3.setPenerbit("Gramedia");
        fiksi3.setTahunTerbit(2018);
        fiksi3.isiKategori();

        Book fiksi4 = new Book();
        fiksi4.setJudul("Dilan 1990");
        fiksi4.setPengarang("Pidi Baiq");
        fiksi4.setPenerbit("Gramedia");
        fiksi4.setTahunTerbit(2014);
        fiksi4.isiKategori();

        Book fiksi5 = new Book();
        fiksi5.setJudul("Dear Nathan");
        fiksi5.setPengarang("Erisca Pebriani");
        fiksi5.setPenerbit("Gramedia");
        fiksi5.setTahunTerbit(2016);
        fiksi5.isiKategori();
    }
}