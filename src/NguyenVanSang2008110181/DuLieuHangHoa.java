package NguyenVanSang2008110181;

public class DuLieuHangHoa {
    DuLieuHangHoa() {
    };

    public DanhSachQuanLy danhSach() {
            DanhSachQuanLy qlhh = new DanhSachQuanLy();
            HangHoa stt1 = new DienTu(123, "Dien Tu", "Tivi", 30000000, "20-11-2020 ", 15);
            HangHoa stt2 = new SanhSu(234, "Sanh Su", "To thuy tinh", 10000, "1-03-2020 ", 20);
            HangHoa stt3 = new ThucPham(345,"Thuc Pham", "Gao nang thom", 20000, "12-11-2020", 100);
            HangHoa stt4 = new DienTu(456, "Dien Tu", "May lanh", 40000000, "2-01-2020", 4);
            HangHoa stt5 = new SanhSu(567, "Sanh Su", "Chen thuy tinh", 70000, "30-01-2021", 30);
            HangHoa stt6 = new ThucPham(011,"Thuc Pham", "Mi tuoi", 13000, "24-12-2020", 120);
            HangHoa stt7 = new DienTu(111, "Dien Tu", "May giat", 20000000, "19-12-2020", 150);
            HangHoa stt8 = new SanhSu(112, "Sanh Su", "Noi ", 350000, "04-05-2020", 25);
            HangHoa stt9 = new ThucPham(113,"Thuc Pham", "banh mi ngot", 45000, "22-12-2021", 120);
            HangHoa stt10 = new DienTu(758, "Dien Tu", "May chup hinh", 15000000, "16-04-2021", 12);

            HangHoa stt11 = new SanhSu(125, "Sanh Su", "Binh thuy tinh", 40000,
                            "11-05-2021", 11);
            HangHoa stt12 = new ThucPham(001, "Thuc Pham", " keo", 30000,
                            "22-09-2021", 13);
            HangHoa stt13 = new DienTu(287, "Dien Tu", "Dien thoai",
                            20000000,
                            "08- 07-2021", 43);
            HangHoa stt14 = new SanhSu(153, "Sanh Su", "Dia ", 60000,
                            "02-09-2021", 57);
            HangHoa stt15 = new ThucPham(952, "Thuc Pham", "Pepsi", 10000,
                            "17-07-2021", 101);
            HangHoa stt16 = new DienTu(717, "Dien Tu", "LapTop", 35000000,
                            "27-08-2021", 59);
            HangHoa stt17 = new SanhSu(759, "Sanh Su", "Ly thuy tinh",
                            50000, "29-05-2021", 102);
            HangHoa stt18 = new ThucPham(779, "Thuc Pham", "Gia vi", 20000,
                            "11-05-2021", 107);
            HangHoa stt19 = new DienTu(798, "Dien Tu", "Tai nghe", 77000,
                            "26-08-2021", 97);
            HangHoa stt20 = new SanhSu(989, "Sanh Su", "Binh gom ", 75000,
                            "29-09-2021", 75);

            qlhh.themVaoDanhSach(stt1);
            qlhh.themVaoDanhSach(stt2);
            qlhh.themVaoDanhSach(stt3);
            qlhh.themVaoDanhSach(stt4);
            qlhh.themVaoDanhSach(stt5);
            qlhh.themVaoDanhSach(stt6);
            qlhh.themVaoDanhSach(stt7);
            qlhh.themVaoDanhSach(stt8);
            qlhh.themVaoDanhSach(stt9);
            qlhh.themVaoDanhSach(stt10);
            qlhh.themVaoDanhSach(stt11);
            qlhh.themVaoDanhSach(stt12);
            qlhh.themVaoDanhSach(stt13);
            qlhh.themVaoDanhSach(stt14);
            qlhh.themVaoDanhSach(stt15);
            qlhh.themVaoDanhSach(stt16);
            qlhh.themVaoDanhSach(stt17);
            qlhh.themVaoDanhSach(stt18);
            qlhh.themVaoDanhSach(stt19);
            qlhh.themVaoDanhSach(stt20);

            return qlhh;

    }

    
}
