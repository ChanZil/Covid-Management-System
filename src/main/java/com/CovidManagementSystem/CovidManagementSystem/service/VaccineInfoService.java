package com.CovidManagementSystem.CovidManagementSystem.service;

import com.CovidManagementSystem.CovidManagementSystem.model.Member;
import com.CovidManagementSystem.CovidManagementSystem.model.VaccineInfo;
import com.CovidManagementSystem.CovidManagementSystem.repository.VaccineInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineInfoService {

    @Autowired
    VaccineInfoRepository vaccineInfoRepository;

    public VaccineInfo createVaccineInfo(VaccineInfo vaccineInfo){
        return vaccineInfoRepository.save(vaccineInfo);
    }

    public VaccineInfo getVaccineInfoById(String id) {
        return vaccineInfoRepository.findById(id).get();
    }

    public List<VaccineInfo> getAllVaccineInfo() {
        return vaccineInfoRepository.findAll();
    }

    public VaccineInfo updateVaccineInfo (VaccineInfo vaccineInfo) {
        return vaccineInfoRepository.save(vaccineInfo);
    }

    public String deleteVaccineInfo (String id) {
        vaccineInfoRepository.deleteById(id);
        return "VaccineInfo has been deleted.";
    }
}
