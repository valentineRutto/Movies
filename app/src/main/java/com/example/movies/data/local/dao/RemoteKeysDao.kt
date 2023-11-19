package com.example.movies.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.movies.data.local.entities.RemoteKeysEntity

@Dao
interface RemoteKeysDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(remoteKey: List<RemoteKeysEntity>)

    @Query("Select * From remote_key Where movie_id = :id")
    suspend fun getRemoteKeyByMovieID(id: Int): RemoteKeysEntity?

    @Query("Delete From remote_key")
    suspend fun clearRemoteKeys()

    @Query("Select created_at From remote_key Order By created_at DESC LIMIT 1")
    suspend fun getCreationTime(): Long?
}