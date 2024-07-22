
import javax.persistence.*;

@Entity
@Table(name = "LichLamViec")
public class LichLamViec {
    @Id
    @Column(name = "id_lich_lam_viec")
    private Integer idLichLamViec;

    @Column(name = "ma_lich_lam_viec")
    private String maLichLamViec;

    @Column(name = "id_nhan_vien")
    private Integer idNhanVien;

    @Column(name = "ngay")
    private null ngay;

    @Column(name = "giao_ca")
    private null giaoCa;

    public Integer getIdLichLamViec() {
        return this.idLichLamViec;
    }

    public void setIdLichLamViec(Integer idLichLamViec) {
        this.idLichLamViec = idLichLamViec;
    }

    public String getMaLichLamViec() {
        return this.maLichLamViec;
    }

    public void setMaLichLamViec(String maLichLamViec) {
        this.maLichLamViec = maLichLamViec;
    }

    public Integer getIdNhanVien() {
        return this.idNhanVien;
    }

    public void setIdNhanVien(Integer idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public null getNgay() {
        return this.ngay;
    }

    public void setNgay(null ngay) {
        this.ngay = ngay;
    }

    public null getGiaoCa() {
        return this.giaoCa;
    }

    public void setGiaoCa(null giaoCa) {
        this.giaoCa = giaoCa;
    }
}
