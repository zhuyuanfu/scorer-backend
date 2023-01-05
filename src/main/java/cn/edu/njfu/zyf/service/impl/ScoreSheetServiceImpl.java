package cn.edu.njfu.zyf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.njfu.zyf.dao.ScoreSheetRepository;
import cn.edu.njfu.zyf.model.ScoreSheet;
import cn.edu.njfu.zyf.service.ScoreSheetService;

@Service
public class ScoreSheetServiceImpl implements ScoreSheetService{

    @Autowired
    private ScoreSheetRepository scoreSheetRepository;
    
    @Override
    public ScoreSheet getScoreSheetByEmployeeNumber(String employeeNumber) {
        // TODO Auto-generated method stub
        
        return null;
    }

    @Override
    public void saveScoreSheet(ScoreSheet ss) {
        scoreSheetRepository.save(ss);
        
    }

    @Override
    public ScoreSheet getScoreSheetByEmployeeNumberAndPassword(String employeeNumber, String password) {
        return scoreSheetRepository.findByEmployeeNumberAndPassword(employeeNumber, password);
    }

}
