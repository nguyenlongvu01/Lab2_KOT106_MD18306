package com.vunlph30245.lab2

class SVModel (var TenSv: String, var maSV: String, var diemTb: Float){

    var daTotNghieps: Boolean? = null
    var tuoi : Int? = null

    constructor(TenSv: String,  maSV: String, diemTb: Float, datotnghieps: Boolean?, tuoi: Int) : this(TenSv, maSV, diemTb) {
        this.daTotNghieps = datotnghieps
        this.tuoi = tuoi
}
fun getTT() : String{
    var thongtins : String
    if (daTotNghieps != null && tuoi != null) {
        thongtins = "Ten: $TenSv , mssv: $maSV , diemTB: $diemTb , da tot nghiep: $daTotNghieps , tuoi: $tuoi"
    } else {
        thongtins = "Ten: $TenSv , mssv: $maSV , diemTB: $diemTb"
    }
    return thongtins


    }
}