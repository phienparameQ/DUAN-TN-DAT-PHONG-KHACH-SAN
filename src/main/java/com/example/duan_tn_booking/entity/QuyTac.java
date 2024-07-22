
import javax.persistence.*;

@Entity
@Table(name = "QuyTac")
public class QuyTac {
    @Id
    @Column(name = "id_quy_tac")
    private Integer idQuyTac;

    @Column(name = "ma_quy_tac")
    private String maQuyTac;

    @Column(name = "noi_dung")
    private null noiDung;

    @Column(name = "mo_ta")
    private null moTa;

    public Integer getIdQuyTac() {
        return this.idQuyTac;
    }

    public void setIdQuyTac(Integer idQuyTac) {
        this.idQuyTac = idQuyTac;
    }

    public String getMaQuyTac() {
        return this.maQuyTac;
    }

    public void setMaQuyTac(String maQuyTac) {
        this.maQuyTac = maQuyTac;
    }

    public null getNoiDung() {
        return this.noiDung;
    }

    public void setNoiDung(null noiDung) {
        this.noiDung = noiDung;
    }

    public null getMoTa() {
        return this.moTa;
    }

    public void setMoTa(null moTa) {
        this.moTa = moTa;
    }
}
