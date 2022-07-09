package cudra.mohamed.twitter_c

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import androidx.recyclerview.widget.LinearLayoutManager
import cudra.mohamed.twitter_c.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        displayTweets()
    }
    fun displayTweets(){
        var tweet1=Tweets("","Cudra","@cudramoher","17h","They sent my offer officially!! I am now a juniour Software Developer!! This is so amazing :)","","33","","77","","899","")
        var tweet2=Tweets("","MJ","@c","17h","They sent my offer officially!! I am now a juniour Software Developer!! This is so amazing :)","","33","","77","","899","")
        var tweet3=Tweets("","CB","@dramoher","17h","They sent my offer officially!! I am now a juniour Software Developer!! This is so amazing :)","","33","","77","","899","")
        var tweet4=Tweets("","SS","@amoher","17h","They sent my offer officially!! I am now a juniour Software Developer!! This is so amazing :)","","33","","77","","899","")
        var tweet5=Tweets("","MD","@oher","17h","They sent my offer officially!! I am now a juniour Software Developer!! This is so amazing :)","","33","","77","","899","")
        var tweet6=Tweets("","MA","@amher","17h","They sent my offer officially!! I am now a juniour Software Developer!! This is so amazing :)","","33","","77","","899","")
        var tweet7=Tweets("","C","@her","17h","They sent my offer officially!! I am now a juniour Software Developer!! This is so amazing :)","","33","","77","","899","")
        var tweet8=Tweets("","CMN","@cuder","17h","They sent my offer officially!! I am now a juniour Software Developer!! This is so amazing :)","","33","","77","","899","")
        var tweet9=Tweets("","AJ","@cmoher","17h","They sent my offer officially!! I am now a juniour Software Developer!! This is so amazing :)","","33","","77","","899","")
        var tweet10=Tweets("","LM","@udroher","17h","They sent my offer officially!! I am now a juniour Software Developer!! This is so amazing :)","","33","","77","","899","")
        var tweet11=Tweets("","RM","@curamoh","17h","They sent my offer officially!! I am now a juniour Software Developer!! This is so amazing :)","","33","","77","","899","")
        var tweet12=Tweets("","MM","@cumoher","17h","They sent my offer officially!! I am now a juniour Software Developer!! This is so amazing :)","","33","","77","","899","")
        var tweet13=Tweets("","HO","@cuer","17h","They sent my offer officially!! I am now a juniour Software Developer!! This is so amazing :)","","33","","77","","899","")
        var tweet14=Tweets("","PO","@amoer","17h","They sent my offer officially!! I am now a juniour Software Developer!! This is so amazing :)","","33","","77","","899","")
        var tweetsList= listOf(tweet1,tweet10,tweet11,tweet12,tweet13,tweet14,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7,tweet8,tweet9)

        var tweetsAdapter=TweetRVAdapter(tweetsList)
        binding.rvTweets.layoutManager=LinearLayoutManager(this)
        binding.rvTweets.adapter=tweetsAdapter
    }
}