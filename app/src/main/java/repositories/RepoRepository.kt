package repositories

import kotlinx.coroutines.flow.Flow
import model.Repo

interface RepoRepository {
    suspend fun listRepositories(user : String) : Flow<List<Repo>>
}