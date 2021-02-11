package MirVracha.MirVrachaTask.service;

import MirVracha.MirVrachaTask.model.ListSaver;
import MirVracha.MirVrachaTask.model.TextModel;
import MirVracha.MirVrachaTask.repository.TextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class TextToDBImpl implements TextToDB {

    @Autowired
    private TextRepository textRepository;

    @Override
    public void AddText(TextModel textModel, ListSaver listSaver) throws FileNotFoundException {

        String fileName = "C:\\Users\\Artur\\IdeaProjects\\MirVrachaTask\\textgen.txt";
        FileReader fileReader = new FileReader(fileName);

        try {

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            List<String> addList = new ArrayList<>();
            while(( line = bufferedReader.readLine()) != null) {
                addList.add(line);
            }
            listSaver.setMain(addList);
            textRepository.save(textModel);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
