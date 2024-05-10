package com.vunlph30245.lab2

class SinhVienManager {
    private val sinhVienList = mutableListOf<SVModel>()

    fun themSinhVien(tenSV: String, maSV: String, diemTB: Float, daTotNghiep: Boolean, tuoi: Int) {
        val sinhVien = SVModel(tenSV, maSV, diemTB, daTotNghiep, tuoi)
        sinhVienList.add(sinhVien)
        println("Thêm sinh viên thành công.")
    }


    fun xoaSinhVien(mssv: String) {
        val iterator = sinhVienList.iterator()
        while (iterator.hasNext()) {
            val sinhVienHienTai = iterator.next()
            if (sinhVienHienTai.maSV == mssv) {
                iterator.remove()
                println("Xóa sinh viên có MSSV $mssv thành công.")
                return
            }
        }
        println("Không tìm thấy sinh viên có MSSV $mssv.")
    }

    fun hienThiDanhSachSinhVien() {
        if (sinhVienList.isEmpty()) {
            println("Không có sinh viên trong danh sách.")
            return
        }
        println("Danh sách Sinh viên:")
        for (sinhVien in sinhVienList) {
            println("Tên: ${sinhVien.TenSv}, MSSV: ${sinhVien.maSV}, " +
                    "Điểm Trung Bình: ${sinhVien.diemTb},Da Tốt Nghiệp: ${sinhVien.daTotNghieps}, " +
                    "Tuổi: ${sinhVien.tuoi}")
        }
    }
}

fun main (){
    val quanLySinhVien = SinhVienManager()

    // Thêm sinh viên
    quanLySinhVien.themSinhVien("Nguyen Long Vu", "PH30245", 8.5f, true, 22)
    quanLySinhVien.themSinhVien("Nguyen Van Trong", "PH34567", 7.8f, false, 21)

    // Hiển thị danh sách sinh viên
    quanLySinhVien.hienThiDanhSachSinhVien()

    // Xóa sinh viên
    quanLySinhVien.xoaSinhVien("PH30245")
    quanLySinhVien.hienThiDanhSachSinhVien()

}



