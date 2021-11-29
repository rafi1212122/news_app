package com.example.news_app.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.news_app.adapter.NewsAdapter
import com.example.news_app.data.DataNews
import com.example.news_app.databinding.FragmentPopularBinding
import com.example.news_app.helper.initViewHeadline

class PopularNewsFragment : Fragment() {

    private var _binding: FragmentPopularBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentPopularBinding.inflate(inflater, container, false)

        binding.rvPopularNews.apply {
            adapter = NewsAdapter(DataNews.dataPopularNews)
            layoutManager = LinearLayoutManager(view?.context)
            setHasFixedSize(true)
        }

        initViewHeadline(binding.newsHeadline, 2)

        return binding.root
    }
}