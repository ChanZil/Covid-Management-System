package com.CovidManagementSystem.CovidManagementSystem.controller;


import com.CovidManagementSystem.CovidManagementSystem.model.Member;
import com.CovidManagementSystem.CovidManagementSystem.model.VaccineInfo;
import com.CovidManagementSystem.CovidManagementSystem.service.VaccineInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/VaccineInfo")
public class VaccineInfoController {

    @Autowired
    VaccineInfoService vaccineInfoService;

    @PostMapping("/create")
    public VaccineInfo createVaccineInfo(@RequestBody VaccineInfo vaccineInfo) {
        return vaccineInfoService.createVaccineInfo(vaccineInfo);
    }

    @GetMapping("/getById/{id}")
    public VaccineInfo getVaccineInfoById(@PathVariable String id) {
        return vaccineInfoService.getVaccineInfoById(id);
    }

    @GetMapping("/all")
    public List<VaccineInfo> getAllVaccineInfo() {
        return vaccineInfoService.getAllVaccineInfo();
    }

    @PutMapping("/update")
    public VaccineInfo updateVaccineInfo(@RequestBody VaccineInfo vaccineInfo) {
        return vaccineInfoService.updateVaccineInfo(vaccineInfo);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteVaccineInfo(@PathVariable String id) {
        return vaccineInfoService.deleteVaccineInfo(id);
    }
}
