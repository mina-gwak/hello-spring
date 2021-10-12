package hello.hellospring.domain;

import javax.persistence.*;

@Entity
public class Member {

    // ID : 고객이 정하는 것이 아니라 시스템이 정하는 임의의 값
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "username")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
