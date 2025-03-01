package com.winter.ott.controller;


import com.winter.ott.dto.MainDto;
import com.winter.ott.dto.SearchMovieResponseDto;
import com.winter.ott.service.MainService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController
@RequestMapping("/main")
@Log4j2
@RequiredArgsConstructor

public class MainController {

    public final MainService mainService;

//    @GetMapping("")
//    public String index() {
//        return "redirect:/diflixpedia/main";
//    }

    @GetMapping("/actorList")
    public List<MainDto> actor(){
        log.info("actorList...........");
        List<MainDto> movieList_actor = mainService.listByActor("Chris Evans");
        return movieList_actor;
    }


    @GetMapping("/GenreList")
    public List<MainDto> genre1(){
        log.info("GenreList...........");
        List<MainDto> movieList_genre = mainService.listByGenre("Action");
        return movieList_genre;
    }

    @GetMapping("/ImdbList")
    public List<MainDto> imdbDesc(){
        log.info("ImdbList...........");
        List<MainDto> movieList_IMDB = mainService.listByImdb();
        return movieList_IMDB;

    }
}


