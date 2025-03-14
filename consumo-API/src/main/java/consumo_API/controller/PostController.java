package consumo_API.controller;

import consumo_API.dto.PostDto;
import consumo_API.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PostController {

    @Autowired
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/post")
    public List<PostDto> getPost(){
        return postService.getPost();
    }

    @GetMapping("/post/{id}")
    public PostDto get(@PathVariable Integer id){
        return postService.get(id);
    }

    @PostMapping("/post")
    public PostDto save(@RequestBody PostDto postDto){
        return postService.save(postDto);
    }

    @PutMapping("/post/{id}")
    public PostDto updateV2(@PathVariable Integer id,@RequestBody PostDto postDto){
        return postService.updateV2(id,postDto);
    }

    @DeleteMapping("/post/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        postService.delete(id);
        return new ResponseEntity<>("Post Eliminado con Id: " + id, HttpStatus.OK);
    }

}
