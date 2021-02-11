package MirVracha.MirVrachaTask.service;

import MirVracha.MirVrachaTask.model.ListSaver;
import MirVracha.MirVrachaTask.model.TextModel;

import java.io.FileNotFoundException;

public interface TextToDB {
    void AddText(TextModel textModel, ListSaver listSaver) throws FileNotFoundException;
}
