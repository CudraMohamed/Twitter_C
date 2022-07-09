package cudra.mohamed.twitter_c

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetRVAdapter (var tweetList:List<Tweets>):RecyclerView.Adapter<TweetViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.tweet_list_item,parent,false)
        return TweetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        var latestTweet=tweetList.get(position)
        holder.tvName.text=latestTweet.name
        holder.tvHashZibobo.text=latestTweet.handle
        holder.tvTime.text=latestTweet.time
        holder.tvTweet.text=latestTweet.tweet
        holder.tvComCount.text=latestTweet.commentsCount
        holder.tvRetCount.text=latestTweet.retCount
        holder.tvLikeCount.text=latestTweet.likeCount

    }

    override fun getItemCount(): Int {
        return tweetList.size
    }
}
class TweetViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvHashZibobo=itemView.findViewById<TextView>(R.id.tvHashZibobo)
    var tvTime=itemView.findViewById<TextView>(R.id.tvTime)
    var tvTweet=itemView.findViewById<TextView>(R.id.tvTweet)
    var tvComCount=itemView.findViewById<TextView>(R.id.tvComCount)
    var tvRetCount=itemView.findViewById<TextView>(R.id.tvRetCount)
    var tvLikeCount=itemView.findViewById<TextView>(R.id.tvLikeCount)
    var ivShare=itemView.findViewById<ImageView>(R.id.ivShare)
    var ivComments=itemView.findViewById<ImageView>(R.id.ivComments)
    var ivRetweet=itemView.findViewById<ImageView>(R.id.ivRetweet)
    var ivZibobo=itemView.findViewById<ImageView>(R.id.ivZibobo)
    var ivLike=itemView.findViewById<ImageView>(R.id.ivLike)
}