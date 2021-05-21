package fastcampus.aop.part4.chapter05.data.response

import fastcampus.aop.part4.chapter05.data.entity.GithubRepoEntity

data class GithubRepoSearchResponse(
    val totalCount: Int,
    val items: List<GithubRepoEntity>
)