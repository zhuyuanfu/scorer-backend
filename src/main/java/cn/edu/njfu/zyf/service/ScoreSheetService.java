package cn.edu.njfu.zyf.service;

import cn.edu.njfu.zyf.model.ScoreSheet;

public interface ScoreSheetService {
    ScoreSheet getScoreSheetByEmployeeNumber(String employeeNumber);
    ScoreSheet getScoreSheetByEmployeeNumberAndPassword(String employeeNumber, String password);
    void saveScoreSheet(ScoreSheet ss);
}
