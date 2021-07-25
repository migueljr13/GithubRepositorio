package services

import model.Repo
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {

    @GET("users/{user}/repos")
    suspend fun listRespositories(@Path("user") user: String) : List<Repo>

}