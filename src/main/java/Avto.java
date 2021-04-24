import javax.persistence.*;
import java.util.Objects;

@Entity
<<<<<<< Updated upstream
@Table(name = "avtoowners")
public class Avto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "surname")
    private String surname;
    @Basic
    @Column(name = "owner_name")
    private String owner_name;
    @Basic
    @Column(name = "middle_name")
    private String middle_name;
    @Basic
    @Column(name = "tel_number")
    private String tel_number;
    @Basic
    @Column(name = "address")
    private String address;
    @Basic
    @Column(name = "mark")
    private String mark;
    @Basic
    @Column(name = "avto_number")
    private String avto_number;
    @Basic
    @Column(name = "teh_number")
    private String teh_number;
    @Basic
    @Column(name = "avto_cost")
    private Integer avto_cost;
    @Basic
    @Column(name = "avto_year")
    private Integer avto_year;


=======
@Table(name = (String)"avtoowners",schema =(String)"public",catalog = (String)"postgres")
public class Avto {
    private Integer id;
    private String surname;
    private String owner_name;
    private String middle_name;
    private String tel_number;
    private String address;
    private String mark;
    private String avto_number;
    private String teh_number;
    private Integer avto_cost;
    private Integer avto_year;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = (String)"id")
>>>>>>> Stashed changes
    public Integer getId() {
        return id;
    }

    public void setId(Integer inpId) {
        this.id = inpId;
    }
<<<<<<< Updated upstream

=======
    @Basic
    @Column(name = (String)"surname")
>>>>>>> Stashed changes
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
<<<<<<< Updated upstream

=======
    @Basic
    @Column(name = (String)"owner_name")
>>>>>>> Stashed changes
    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }
<<<<<<< Updated upstream

=======
    @Basic
    @Column(name = (String)"middle_name")
>>>>>>> Stashed changes
    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }
<<<<<<< Updated upstream

=======
    @Basic
    @Column(name = (String)"tel_number")
>>>>>>> Stashed changes
    public String getTel_number() {
        return tel_number;
    }

    public void setTel_number(String tel_number) {
        this.tel_number = tel_number;
    }
<<<<<<< Updated upstream

=======
    @Basic
    @Column(name = (String)"address")
>>>>>>> Stashed changes
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
<<<<<<< Updated upstream

=======
    @Basic
    @Column(name = (String)"mark")
>>>>>>> Stashed changes
    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
<<<<<<< Updated upstream

=======
    @Basic
    @Column(name = (String)"avto_number")
>>>>>>> Stashed changes
    public String getAvto_number() {
        return avto_number;
    }

    public void setAvto_number(String avto_number) {
        this.avto_number = avto_number;
    }
<<<<<<< Updated upstream

=======
    @Basic
    @Column(name = (String)"teh_number")
>>>>>>> Stashed changes
    public String getTeh_number() {
        return teh_number;
    }

    public void setTeh_number(String teh_number) {
        this.teh_number = teh_number;
    }
<<<<<<< Updated upstream

=======
    @Basic
    @Column(name = (String)"avto_cost")
>>>>>>> Stashed changes
    public Integer getAvto_cost() {
        return avto_cost;
    }

    public void setAvto_cost(Integer avto_cost) {
        this.avto_cost = avto_cost;
    }
<<<<<<< Updated upstream

=======
    @Basic
    @Column(name = (String)"avto_year")
>>>>>>> Stashed changes
    public Integer getAvto_year() {
        return avto_year;
    }

    public void setAvto_year(Integer avto_year) {
        this.avto_year = avto_year;
    }

    @Override
    public boolean equals(Object obj) {
<<<<<<< Updated upstream
        if (obj == null && this == null)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
=======
        if (this==obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
>>>>>>> Stashed changes
            return false;
        Avto myObj = (Avto) obj;
        return Objects.equals(this.id, myObj.id) && Objects.equals(this.address, myObj.address)
                && Objects.equals(this.avto_cost, myObj.avto_cost) && Objects.equals(this.avto_number, myObj.avto_number)
                && Objects.equals(this.avto_year, myObj.avto_year) && Objects.equals(this.mark, myObj.mark)
                && Objects.equals(this.middle_name, myObj.middle_name) && Objects.equals(this.owner_name, myObj.owner_name)
                && Objects.equals(this.surname, myObj.surname) && Objects.equals(this.teh_number, myObj.teh_number)
                && Objects.equals(this.tel_number, myObj.tel_number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, avto_cost, avto_year, avto_number, mark, middle_name, owner_name, surname,
                teh_number, tel_number);
    }
}