package com.talebrawlmod.fake

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.talebrawlmod.fake.databinding.FeatureItemBinding

class FeatureAdapter(private val features: List<String>) :
    RecyclerView.Adapter<FeatureAdapter.FeatureViewHolder>() {

    inner class FeatureViewHolder(private val binding: FeatureItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(feature: String) {
            binding.featureText.text = feature
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeatureViewHolder {
        val binding = FeatureItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FeatureViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FeatureViewHolder, position: Int) {
        holder.bind(features[position])
    }

    override fun getItemCount() = features.size
}