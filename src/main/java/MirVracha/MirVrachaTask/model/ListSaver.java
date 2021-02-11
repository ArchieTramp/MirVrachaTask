package MirVracha.MirVrachaTask.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@EqualsAndHashCode
public class ListSaver {

    @Id
    private Long id;

   @ManyToOne
    private  TextModel main;




}
