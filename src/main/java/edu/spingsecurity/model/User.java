package edu.spingsecurity.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@SequenceGenerator(
    name = "user_seq_gen",
    sequenceName = "user_seq",
    initialValue = 2010
)
@Entity
@Data
public class User {

    @EqualsAndHashCode.Include
    @GeneratedValue(generator = "user_seq_gen")
    @Id
    private long id;

    private String login;

    private String password;

    @ToString.Exclude
    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> roles;

    @ToString.Exclude
    @JoinTable(name = "user_company")
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Company> companies;
}
