package MirVracha.MirVrachaTask.model;

import lombok.*;

import javax.persistence.*;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@EqualsAndHashCode
@Table(name = "mirvrachadb", uniqueConstraints = @UniqueConstraint(columnNames = {"id"}))
public class TextModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String paragraph;


}
