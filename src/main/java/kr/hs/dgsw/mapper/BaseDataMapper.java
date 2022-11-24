package kr.hs.dgsw.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Map;

@Mapper
public interface BaseDataMapper {
//    int join(Map<String, Object> params);
//    Map<String, Object> login(Map<String, Object> params);
//    int Erpost(Map<String, Object> params);
//    int Ercomment(Map<String, Object> params);
//    List<Map<String, Object>> Erviewposts();
//    Map<String, Object> Erviewpost(int i);
//    int Erupdate(Map<String, Object> params);
//    int Erdelete(Map<String, Object> params);
//    List<Map<String, Object>> getmyEr(String id);
//    int updatemy(Map<String, Object> params);
//    List<Map<String, Object>> infoviewposts();
//    Map<String, Object> infoviewpost(int i);
//    int infopost(Map<String, Object> params);
//    int infodelete(Map<String, Object> params);
//    int infoupdate(Map<String, Object> params);
//    int infocomment(Map<String, Object> params);
//    List<Map<String, Object>> getmyinfo(String id);
//    Map<String, Object> getmy(String id);
    List<Map<String, Object>> getquestions(String category);
    List<Map<String, Object>> getallquestions();
    int postquestion(Map<String, Object> params);
    Map<String, Object> getquestion(String category, Integer id);
    Map<String, Object> getallquestion(Integer id);
    List<Map<String, Object>> getallcomments(Integer id);
    List<Map<String, Object>> getcomments(String category, Integer id);
    int postcomment(Map<String, Object> params);

}