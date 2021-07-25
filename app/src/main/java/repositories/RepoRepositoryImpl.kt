package repositories

import core.RemoteException
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import services.GithubService

class RepoRepositoryImpl(private val service: GithubService) : RepoRepository {

    override suspend fun listRepositories(user: String) = flow {
        try {
            val repoList = service.listRespositories(user)
            emit(repoList)
        } catch (ex: HttpException) {
            throw RemoteException(ex.message() ?: "Não foi possível fazer a busca no momento")
        }
    }
}