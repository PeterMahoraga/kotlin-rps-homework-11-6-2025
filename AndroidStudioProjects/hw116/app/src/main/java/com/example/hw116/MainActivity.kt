package com.example.hw116

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    // 綁定元件 (擴充 3.1)
    private lateinit var tvResult: TextView
    private lateinit var ivPlayer: ImageView
    private lateinit var ivComputer: ImageView
    private lateinit var tvPlayerScore: TextView
    private lateinit var tvComputerScore: TextView
    private lateinit var btnRock: Button
    private lateinit var btnPaper: Button
    private lateinit var btnScissors: Button

    // 分數變數
    private var playerScore = 0
    private var computerScore = 0

    // 選項陣列 (書本: 0=rock, 1=paper, 2=scissors)
    private val choices = arrayOf("rock", "paper", "scissors")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 綁定 (3.1 + 3.2 新增)
        tvResult = findViewById(R.id.tvResult)
        ivPlayer = findViewById(R.id.ivPlayer)
        ivComputer = findViewById(R.id.ivComputer)
        tvPlayerScore = findViewById(R.id.tvPlayerScore)
        tvComputerScore = findViewById(R.id.tvComputerScore)
        btnRock = findViewById(R.id.btnRock)
        btnPaper = findViewById(R.id.btnPaper)
        btnScissors = findViewById(R.id.btnScissors)

        // 監聽 (呼叫 playGame)
        btnRock.setOnClickListener { playGame(0) }
        btnPaper.setOnClickListener { playGame(1) }
        btnScissors.setOnClickListener { playGame(2) }
    }

    // 3.2: 遊戲邏輯函式
    private fun playGame(playerChoice: Int) {
        val computerChoice = Random.nextInt(3)  // 電腦隨機 0-2

        // 更新圖示 (書本: 用 when 切換系統 drawable)
        when (playerChoice) {
            0 -> ivPlayer.setImageResource(android.R.drawable.ic_menu_gallery)  // 石頭
            1 -> ivPlayer.setImageResource(android.R.drawable.ic_menu_info_details)  // 布
            2 -> ivPlayer.setImageResource(android.R.drawable.ic_menu_compass)  // 剪刀
        }
        when (computerChoice) {
            0 -> ivComputer.setImageResource(android.R.drawable.ic_menu_camera)
            1 -> ivComputer.setImageResource(android.R.drawable.ic_menu_send)
            2 -> ivComputer.setImageResource(android.R.drawable.ic_menu_crop)
        }

        // 判斷勝負 (書本 when 邏輯)
        val result = when {
            playerChoice == computerChoice -> "平手！"
            (playerChoice == 0 && computerChoice == 2) ||  // 石頭 > 剪刀
                    (playerChoice == 1 && computerChoice == 0) ||  // 布 > 石頭
                    (playerChoice == 2 && computerChoice == 1) -> {  // 剪刀 > 布
                playerScore++
                tvPlayerScore.text = "玩家: $playerScore"
                "你贏了！"
            }
            else -> {
                computerScore++
                tvComputerScore.text = "電腦: $computerScore"
                "電腦贏了！"
            }
        }

        // 更新結果 (顯示選擇)
        tvResult.text = "$result (你: ${choices[playerChoice]}, 電腦: ${choices[computerChoice]})"
    }
}