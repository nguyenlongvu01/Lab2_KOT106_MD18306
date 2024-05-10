package com.vunlph30245.lab2

fun main() {
    // làm việc với null safety

//    val tenSV : String? = "Nguyen Long Vu"
//
//    if (tenSV != null) {
//        val mssv = getThongTinSV(tenSV!!)
//        println("MSSV của $tenSV : $mssv")
//    }

    val sv1 : SinhVienModel = SinhVienModel("Nguyen Long Vu", "PH30245", 9.5f)

    val sv2 : SinhVienModel = SinhVienModel("Nguyen Van Trong", "PH30246", 8.5f)

    sv2.daTotNghiep = false
    sv2.tuoi = 21

    val sv3 = SinhVienModel("Tran Thu Thao", "PH12345", 8.5f, false, 20)

    // tao va xu ly danh sach sv
    val listSV = mutableListOf<SinhVienModel>()
    listSV.add(sv1)
    listSV.add(sv2)
    listSV.add(sv3)

    // xoa phan tu cuoi trong danh sach
    listSV.removeAt(listSV.size - 1)

    // cach 1: duyet nhanh
    println("Duyet nhanh")
    println("------------------")
    for (sv in listSV) {
        println(sv.getThongTin())
    }
    println("------------------")

    // cach 2: duyet co quan tam index phan tu trong list
    println("Duyet co index")
    println("------------------")
    for (i in listSV.indices) {
        println("Thong tin $i : ${listSV.get(i).getThongTin()}")
    }
}

fun getThongTinSV (tenSV: String) : String? {
    when (tenSV) {
        "Nguyen Long Vu" -> {
            return "PH30245"
        }
        "Nguyen Van Trong" -> return "PH30246"
        else -> return null
    }
    return null
}