package MirVracha.MirVrachaTask.service;

import MirVracha.MirVrachaTask.model.TextModel;
import MirVracha.MirVrachaTask.repository.TextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TextToDBImpl implements TextToDB{

    @Autowired
    private TextRepository textRepository;

    @Override
    public void AddText(TextModel textModel) {

    }
}
