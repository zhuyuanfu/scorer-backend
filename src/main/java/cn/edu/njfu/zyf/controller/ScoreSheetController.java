package cn.edu.njfu.zyf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.njfu.zyf.model.ScoreSheet;
import cn.edu.njfu.zyf.service.ScoreSheetService;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@RestController
@RequestMapping("/scoreSheet")
public class ScoreSheetController {
    
    @Autowired
    private ScoreSheetService scoreSheetService;
    
    @ApiOperation("根据用户名和密码找到一个评分表")
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ScoreSheet findByEmployeeNumberAndPassword(String employeeNumber, String password) {
        return scoreSheetService.getScoreSheetByEmployeeNumberAndPassword(employeeNumber, password);
    }
    
    @ApiOperation("保存评分表")
    @RequestMapping(value = "/save", method = RequestMethod.PUT)
    public void saveScoreSheet(@RequestBody ScoreSheet scoreSheet) {
        scoreSheetService.saveScoreSheet(scoreSheet);
    }
}
