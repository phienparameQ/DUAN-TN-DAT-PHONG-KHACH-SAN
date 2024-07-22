
import javax.persistence.*;

@Entity
@Table(name = "KhuyenMai")
public class KhuyenMai {
    @Id
    @Column(name = "id_khuyen_mai")
    private Integer idKhuyenMai;

    @Column(name = "ma_khuyen_mai")
    private String maKhuyenMai;

    @Column(name = "ten_khuyen_mai")
    private String tenKhuyenMai;

    @Column(name = "mo_ta")
    private null moTa;

    @Column(name = "ngay_bat_dau")
    private null ngayBatDau;

    @Column(name = "ngay_ket_thuc")
    private null ngayKetThuc;

    @Column(name = "giam_gia")
    private null giamGia;

    @Column(name = "loai_giam")
    private Boolean loaiGiam;

    public Integer getIdKhuyenMai() {
        return this.idKhuyenMai;
    }

    public void setIdKhuyenMai(Integer idKhuyenMai) {
        this.idKhuyenMai = idKhuyenMai;
    }

    public String getMaKhuyenMai() {
        return this.maKhuyenMai;
    }

    public void setMaKhuyenMai(String maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    public String getTenKhuyenMai() {
        return this.tenKhuyenMai;
    }

    public void setTenKhuyenMai(String tenKhuyenMai) {
        this.tenKhuyenMai = tenKhuyenMai;
    }

    public null getMoTa() {
        return this.moTa;
    }

    public void setMoTa(null moTa) {
        this.moTa = moTa;
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

    public null getGiamGia() {
        return this.giamGia;
    }

    public void setGiamGia(null giamGia) {
        this.giamGia = giamGia;
    }

    public Boolean getLoaiGiam() {
        return this.loaiGiam;
    }

    public void setLoaiGiam(Boolean loaiGiam) {
        this.loaiGiam = loaiGiam;
    }
}
