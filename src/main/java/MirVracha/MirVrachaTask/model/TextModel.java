package MirVracha.MirVrachaTask.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@EqualsAndHashCode
@Table(name = "mirvrachadb", uniqueConstraints = @UniqueConstraint(columnNames = {"id"}))
public class TextModel {

    @OneToMany(mappedBy = "main")
    private List<ListSaver> listSavers;

    @Id
    private Long id;


}

