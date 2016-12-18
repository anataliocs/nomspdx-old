package com.nomspdx.api.web.rest;

import com.nomspdx.api.model.effects.Effects;
import com.nomspdx.api.model.flowers.Flowers;
import com.nomspdx.api.model.strains.Strains;
import com.nomspdx.api.service.external.CannabisReportsService;
import com.nomspdx.api.service.external.CannabisReportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@RestController
@RequestMapping("/cannabisreports")
public class CannabisReportsResource {

    @Autowired
    CannabisReportsService cannabisReportsService;

    @GetMapping("/strains")
    public ResponseEntity<Strains> activateAccount(@RequestParam(value = "sort") String sort,
                                                   @RequestParam(value = "page") String page) {

        ResponseEntity<Strains> result = cannabisReportsService.getStrains("", "");

        return result;
    }

    @GetMapping("/strains/{ucpc}/effectsFlavors")
    public ResponseEntity<Effects> getEffectsByUcPc(@PathVariable(value = "ucpc") String ucpc) {
        return new ResponseEntity<Effects>(cannabisReportsService.getEffectsByUcpc(ucpc), HttpStatus.OK);
    }

    @GetMapping("/flowers")
    public ResponseEntity<Flowers> getFlowers(@RequestParam(value = "sort") String sort,
                                              @RequestParam(value = "page") String page) {
        return new ResponseEntity<Flowers>(cannabisReportsService.getFlowers("",""), HttpStatus.OK);
    }
}
