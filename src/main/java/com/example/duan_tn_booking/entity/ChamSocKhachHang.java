
import javax.persistence.*;

@Entity
@Table(name = "ChamSocKhachHang")
public class ChamSocKhachHang {
    @Id
    @Column(name = "id_cham_soc_khach_hang")
    private Integer idChamSocKhachHang;

    @Column(name = "ma_cham_soc_khach_hang")
    private String maChamSocKhachHang;

    @Column(name = "id_khach_hang")
    private Integer idKhachHang;

    @Column(name = "id_nhan_vien")
    private Integer idNhanVien;

    @Column(name = "ngay_bat_dau")
    private null ngayBatDau;

    @Column(name = "ngay_ket_thuc")
    private null ngayKetThuc;

    @Column(name = "mo_ta")
    private null moTa;

    public Integer getIdChamSocKhachHang() {
        return this.idChamSocKhachHang;
    }

    public void setIdChamSocKhachHang(Integer idChamSocKhachHang) {
        this.idChamSocKhachHang = idChamSocKhachHang;
    }

    public String getMaChamSocKhachHang() {
        return this.maChamSocKhachHang;
    }

    public void setMaChamSocKhachHang(String maChamSocKhachHang) {
        this.maChamSocKhachHang = maChamSocKhachHang;
    }

    public Integer getIdKhachHang() {
        return this.idKhachHang;
    }

    public void setIdKhachHang(Integer idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public Integer getIdNhanVien() {
        return this.idNhanVien;
    }

    public void setIdNhanVien(Integer idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public null getNgayBatDau() {
        return this.ngayBatDau;
    }

    public void setNgayBatDau(null ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public null getNgayKetThuc() {
        return this.ngayKetThuc;
    }

    public void setNgayKetThuc(null ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public null getMoTa() {
        return this.moTa;
    }

    public void setMoTa(null moTa) {
        this.moTa = moTa;
    }
}
